package com.example.Shoppingmall.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shoppingmall.Entity.ShopOwner;
import com.example.Shoppingmall.Repository.ShopOwnerReop;

@Service
public class Shopser {

    @Autowired
    private ShopOwnerReop shopOwnerRepository;

    // Save Shop Owner
    public ShopOwner saveShopOwner(ShopOwner shopOwner) {
        return shopOwnerRepository.save(shopOwner);
    }

    // Get all Shop Owners
    public List<ShopOwner> getAllShopOwners() {
        return shopOwnerRepository.findAll();
    }

    // Get Shop Owner by ID
    public ShopOwner getShopOwnerById(int id) {
        return shopOwnerRepository.findById(id).orElse(null);
    }

    // Delete Shop Owner
    public void deleteShopOwner(int id) {
        shopOwnerRepository.deleteById(id);
    }
}