package com.willo.app

import org.scalatest.FunSuite

class ShopTests extends FunSuite {

    test("the total should be calculated correctly") {
        var products=List("Cola","Coffee","Cheese Sandwich","Steak Sandwich")
        val basket = new Basket(products);
        assert(basket.getTotal() == 7.5)
    }

}

