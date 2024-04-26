package ee.shop.repairback.business.cart;

import ee.shop.repairback.business.cart.dto.ProductWithQuantityInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class CartController {

    private CartService cartService;

    @PostMapping("/cart")
    public void addOrderItemToCart(@RequestParam Integer userId, @RequestParam Integer productId) {
        cartService.addOrderItemToCart(userId, productId);
    }

    @PostMapping("/cart/repairitem")
    public void addRepairOrderItemToCart(@RequestParam Integer userId, @RequestParam Integer repairItemId) {
        cartService.addRepairOrderItemToCart(userId, repairItemId);
    }

    @GetMapping("/cart/update/{userId}")
    public Integer updateCartQty(@PathVariable Integer userId) {
        return cartService.updateCartQty(userId);
    }

    @GetMapping("/cart/items/{userId}")
    public List<ProductWithQuantityInfo> getCartItems(@PathVariable Integer userId){

        return cartService.getCartItems(userId);
    }

    @PutMapping("/basket/empty")
    public void deletePendingOrder(@RequestParam Integer userId) {
        cartService.deletePendingOrder(userId);
    }
    @PutMapping("/basket/order")
    public void completePendingOrder(@RequestParam Integer userId) {
        cartService.completePendingOrder(userId);
    }
    @PutMapping("/cartitem/add")
    public void addItemQtyInCart (@RequestParam Integer userId, @RequestParam Integer productId,@RequestParam Integer repairItemId){
        cartService.addItemQtyInCart(userId, productId, repairItemId);
    }

    public void substractItemQtyFromCart(@RequestParam Integer userId, @RequestParam Integer productId, @RequestParam Integer repairItemId) {
        cartService.substractItemQtyFromCart(userId, productId, repairItemId);
    }
}
