/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki durumda dangling else yoktur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app

fun main()
{
    for (i in 0 until 10)
        print("$i ")

    println()
}