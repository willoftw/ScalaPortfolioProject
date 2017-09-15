package com.willo.app

import org.scalatest.FunSuite

class ShopTests extends FunSuite {

    test("When all purchased items are drinks no service charge is applied") {
        var products=List("Cola","Coffee")
        val basket = new Basket(products);
        assert(basket.getTotal() == 1.5)
    }

}

