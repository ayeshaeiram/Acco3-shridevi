package com.example.Shoppingmall.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoppingmall.Entity.ShopOwner;
import com.example.Shoppingmall.Service.Shopser;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {

    @Autowired
    private Shopser shopOwnerService;

    @PostMapping("/saveowner")
    public ShopOwner saveShopOwner(@RequestBody ShopOwner shopOwner) {
        return shopOwnerService.saveShopOwner(shopOwner);
    }

    @GetMapping
    public List<ShopOwner> getAllShopOwners() {
        return shopOwnerService.getAllShopOwners();
    }

    @GetMapping("/{id}")
    public ShopOwner getShopOwnerById(@PathVariable int id) {
        return shopOwnerService.getShopOwnerById(id);
    }

    @PutMapping("/{id}")
    public ShopOwner updateShopOwner(
            @PathVariable int id,
            @RequestBody ShopOwner shopOwner) {

        shopOwner.setShopOwnerId(id);
        return shopOwnerService.saveShopOwner(shopOwner);
    }

    @DeleteMapping("/{id}")
    public String deleteShopOwner(@PathVariable int id) {
        shopOwnerService.deleteShopOwner(id);
        return "Shop Owner deleted successfully";
    }
}