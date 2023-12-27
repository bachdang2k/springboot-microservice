package com.bachdang2k.inventoryservice.Inventory;

import java.util.List;

public interface InventoryService {

    List<InventoryResponse> isInStock(List<String> skuCode);
}
