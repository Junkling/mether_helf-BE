package io.elice.shoppingmall.domain.orders.dto.result;
import io.elice.shoppingmall.domain.item.entity.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrdersResult {
    private Long orderId;

    private String title;

    private String payment;

    private String address;

    private List<Item> itemList;


}