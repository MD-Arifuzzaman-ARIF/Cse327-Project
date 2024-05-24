package com.sheryians.major.controller;

import com.sheryians.major.model.Category;
import com.sheryians.major.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
<<<<<<< Updated upstream
=======

    /**
     * The upload directory for the product image.
     */
    public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/productImages";
    /**
     * Author S. M. Mahedi Hasan Category
     * Declare Global Variable
     */
>>>>>>> Stashed changes
    @Autowired
    CategoryService categoryService;
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    @GetMapping("/admin/categories")
    public String getCat(Model model){
        model.addAttribute("categories",categoryService.getAllCategory());
        return "categories";
    }
    @GetMapping("/admin/categories/add")
    public String getCatAdd(Model model){
        model.addAttribute("category",new Category());
        return "categoriesAdd";
    }
    @PostMapping("/admin/categories/add")
    public String postCatAdd(@ModelAttribute("category") Category category){
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }

}
