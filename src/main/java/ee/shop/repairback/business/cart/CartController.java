package ee.shop.repairback.business.cart;

import ee.shop.repairback.business.cart.dto.OrderItemRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor

public class CartController {

    private CartService cartService;

    @PostMapping("/cart")
    public void addOrderItemToCart(@RequestParam Integer userId, @RequestParam Integer productId) {
        cartService.addOrderItemToCart(userId, productId);
    }
    @GetMapping("/cart/update/{userId}")
    public Integer  updateCartQty(@PathVariable Integer userId){
        return cartService.updateCartQty(userId);
    }
}
