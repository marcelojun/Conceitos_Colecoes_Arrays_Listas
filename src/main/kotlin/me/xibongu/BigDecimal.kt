package me.xibongu

import java.math.BigDecimal

/* Funções estendidas, ela nos dá uma possibildade de criar funções diversas de um tipo especifico
* sem precisar herdar,sem precisar usar decorator part.. É uma função a mais no escopo no projeto
* além daquilo que ja temos dentro das funções normais daquele tipo ,colection,double,como por exemplo
* */

fun Array<BigDecimal>.somatoria()=this.reduce{
    acc,valor->acc+valor
}
fun Array<BigDecimal>.media()=
    if(this.isEmpty())BigDecimal.ZERO
    else this.somatoria()/this.size.toBigDecimal()

