package org.example.sda_project.Controller;

import org.example.sda_project.Bean.Item;
import org.example.sda_project.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/ItemHome")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("")
    public String getItemHomePage()
    {
        return "Default";
    }

    @PostMapping("AddItem_submit")
    public String addItem(@RequestParam("title") String title, @RequestParam("description") String description , @RequestParam("price") String price,
                          MultipartFile image1, MultipartFile image2,MultipartFile image3,
                          RedirectAttributes redirectAttributes)
    {
        Item item = new Item();
        item.setName(title);
        item.setDescription(description);
        // Convert the price to a doubles
        item.setPrice(Double.parseDouble(price));
        item.setStudentId(1);

        try {
            item.setImage1(image1.getBytes());
            item.setImage2(image2.getBytes());
            item.setImage3(image3.getBytes());
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Error uploading image");
            e.printStackTrace();

        }

        itemService.addItem(item);

        return "redirect:/StudentHome/Marketplace";
    }

}
