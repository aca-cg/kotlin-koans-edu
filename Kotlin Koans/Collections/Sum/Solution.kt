fun Customer.getTotalOrderPrice(): Double =
    <taskWindow>orders.flatMap { it.products }.sumByDouble { it.price }</taskWindow>