package ee.shop.repairback.business.cart;

import ee.shop.repairback.business.cart.dto.OrderItemRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class CartController {

    private CartService cartService;

    @PostMapping("/cart")
    public void addOrderItemToCart(@RequestParam Integer userId, @RequestParam Integer productId) {
        cartService.addOrderItemToCart(userId, productId);
    }
}
