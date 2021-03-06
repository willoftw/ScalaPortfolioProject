package com.willo.app

import org.scalatest.FunSuite

class ShopTests extends FunSuite {

    test("When all purchased items are drinks no service charge is applied") {
        var products=List("Cola","Coffee")
        val basket = new Basket(products);
        assert(basket.getTotal() == 1.5)
    }

    test("When purchased items include any food apply a service charge of 10% to the total bill") {
        var products=List("Cola","Coffee","Cheese Sandwich")
        val basket = new Basket(products);
        assert(basket.getTotal() == 3.85)
    }

    test("When purchased items include any hot food apply a service charge of 20% to the total bill") {
        var products=List("Cola","Coffee","Cheese Sandwich","Steak Sandwich")
        val basket = new Basket(products);
        assert(basket.getTotal() == 9.0)
    }

    test("Customer should not be charged more than £20 service charge") {
        var products=List.fill(50)("Steak Sandwich")
        val basket = new Basket(products);
        assert(basket.getTotal() == 220.0)
    }
    

}

