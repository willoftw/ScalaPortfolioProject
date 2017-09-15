package com.willo.app

import org.scalatest.FunSuite

class ProductTests extends FunSuite {
    val p = Product("Cola","Cold",0.50f,"Drink");

    test("the name is set correctly in constructor") {
        assert(p.name == "Cola")
    }
    test("the temperature is set correctly in constructor") {
        assert(p.temperature == "Cold")
    }
    test("the price is set correctly in constructor") {
        assert(p.price == 0.50f)
    }

    test("the foodtype is set correctly in constructor") {
        assert(p.foodtype == "Drink")
    }
}