package fixture;

import kitchenpos.domain.Order;
import kitchenpos.domain.OrderLineItem;

import java.time.LocalDateTime;
import java.util.List;

public class OrderBuilder {
    private Long id;
    private Long orderTableId;
    private String orderStatus;
    private LocalDateTime orderedTime;
    private List<OrderLineItem> orderLineItems;

    public static OrderBuilder init() {
        final OrderBuilder builder = new OrderBuilder();
        builder.id = null;
        builder.orderTableId = 9L;
        builder.orderStatus = "COOKING";
        builder.orderedTime = LocalDateTime.now();
        builder.orderLineItems = List.of(
                OrderLineItemBuilder.init().menuId(1L).build(),
                OrderLineItemBuilder.init().menuId(2L).build()
        );
        return builder;
    }

    public OrderBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public OrderBuilder orderTableId(Long orderTableId) {
        this.orderTableId = orderTableId;
        return this;
    }

    public OrderBuilder orderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public OrderBuilder orderedTime(LocalDateTime orderedTime) {
        this.orderedTime = orderedTime;
        return this;
    }

    public OrderBuilder orderLineItems(List<OrderLineItem> orderLineItems) {
        this.orderLineItems = orderLineItems;
        return this;
    }

    public Order build() {
        final Order order = new Order();
        order.setId(this.id);
        order.setOrderTableId(this.orderTableId);
        order.setOrderStatus(this.orderStatus);
        order.setOrderedTime(this.orderedTime);
        order.setOrderLineItems(this.orderLineItems);
        return order;
    }
}
