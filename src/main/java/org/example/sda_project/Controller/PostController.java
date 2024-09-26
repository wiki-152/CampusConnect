package org.example.sda_project.Controller;

import org.example.sda_project.Bean.Post;
import org.example.sda_project.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/PostHome")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("")
    public String getPostPage()
    {
        return "Post";
    }

    @RequestMapping("AddPost")
    public String getAddPostPage()
    {
        return "AddPost";
    }

    @PostMapping("AddPost_submit")
    public String addPost(@RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("author") String author,
                          MultipartFile image, RedirectAttributes redirectAttributes)
    {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setAuthor(author);
        post.setStudentId(1);

        try {
            post.setImage(image.getBytes());
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Error uploading image");
            e.printStackTrace();
        }

        postService.addPost(post);
        // Add the post to the database
        return "redirect:/StudentHome/Feed";
    }

    @PostMapping("DeletePost/{studentId}")
    public String getDeletePostPage(@RequestParam ("studentId") Integer studentId, Model model)
    {
        // Print the student ID to the console if null or not check

//        if (studentId == null) {
//            System.out.println("Student ID is null");
//        } else {
//            System.out.println("Student ID: " + studentId);
//        }

        // Get All Posts By Student ID

        List<Post> posts = postService.getPostsByStudentId(studentId);

        model.addAttribute("posts", posts);

        return "DeletePost";
    }

    @PostMapping("DeletePost/id/{postId}")
    public String deletePost(@RequestParam("postId") Integer postId)
    {
        postService.deletePost(postId);
        return "redirect:/StudentHome/Feed";
    }

}
