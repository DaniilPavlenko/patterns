package ru.dpav.patterns.adapter.model.duck

class MallardDuck : Duck {
    override fun quack() = println("Quack")

    override fun fly() = println("I'm flying")
}