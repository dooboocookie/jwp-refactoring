package kitchenpos.ui.request;

import java.util.List;
import java.util.Objects;

public class OrderRequest {
    private final Long orderTableId;
    private final String orderStatus;
    private final List<OrderLineItemRequest> orderLineItemRequests;

    public OrderRequest(final Long orderTableId,
                        final String orderStatus,
                        final List<OrderLineItemRequest> orderLineItemRequests) {
        this.orderTableId = orderTableId;
        this.orderStatus = orderStatus;
        this.orderLineItemRequests = orderLineItemRequests;
    }

    public Long getOrderTableId() {
        return orderTableId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public List<OrderLineItemRequest> getOrderLineItemRequests() {
        return orderLineItemRequests;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final OrderRequest that = (OrderRequest) o;
        return Objects.equals(orderTableId, that.orderTableId)
                && Objects.equals(orderStatus, that.orderStatus)
                && Objects.equals(orderLineItemRequests, that.orderLineItemRequests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderTableId, orderStatus, orderLineItemRequests);
    }
}
