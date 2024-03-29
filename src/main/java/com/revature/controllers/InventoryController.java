package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Inventory;
import com.revature.services.InventoryService;

@RestController
@RequestMapping("inventories")
public class InventoryController {
	
	private InventoryService inventoryService;

	public InventoryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public InventoryController(InventoryService is) {
		this.inventoryService = is;
	}
	
	@GetMapping
	public List<Inventory> findAll(){
		return inventoryService.findAll();
	}
	
	@GetMapping("inventory/{inventory}")
	public List<Inventory> findByInventory(@PathVariable String inventory) {
		return inventoryService.findByInventory(inventory);
	}
	
	@GetMapping("{id}")
	public Inventory findById(@PathVariable Integer id) {
		return inventoryService.findById(id);
	}
	
	@PostMapping
	public Inventory save(@Valid @RequestBody Inventory inventory) {
		return inventoryService.save(inventory);
	}
	
	@DeleteMapping
	public void delete(@Valid @RequestBody Inventory inventory) {
		inventoryService.delete(inventory);
	}
	
	@PatchMapping
	public Inventory updateArea(@Valid @RequestBody Inventory inventory) {
		return inventoryService.save(inventory);		
	}
	
	
}
