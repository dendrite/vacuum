package ru.go.vacuum.model



import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(StuffAttributes)
class StuffAttributesTests {

    void testSizeAttributes(){

        def attrSize = new StuffAttributes(title: "Размеры Российские", type: new StuffCategory(name: "Одежда"), attributeType: AttributeItem.TypeItem.INTEGER)

        attrSize
                .add(new AttributeItem(name: "40", value: 40, type: AttributeItem.TypeItem.INTEGER))
                .add(new AttributeItem(name: "42", value: 42, type: AttributeItem.TypeItem.INTEGER))
                .add(new AttributeItem(name: "46", value: 46, type: AttributeItem.TypeItem.INTEGER))

        def attrColor = new StuffAttributes(title: "Цвет отображения", type: new StuffCategory(name: "Одежда"), attributeType: AttributeItem.TypeItem.STRING)

        attrColor
                .add(new AttributeItem(name: "Красный", value: "#FF0000", type: AttributeItem.TypeItem.STRING))
                .add(new AttributeItem(name: "Синий", value: "#00FF00", type: AttributeItem.TypeItem.STRING))
                .add(new AttributeItem(name: "Зеленый", value: "#0000FF", type: AttributeItem.TypeItem.STRING))


        println "Размеры = " + attrSize
        println "Цвета = " + attrColor


    }

}
