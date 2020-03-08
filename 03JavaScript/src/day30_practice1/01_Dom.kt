/**
 * created by 江心才子, 2020/3/6
 * Copyright (c) 2020, 270628297@qq.com All Rights Reserved.
 * #                   *********                            #
 * #                  ************                          #
 * #                  *************                         #
 * #                 **  ***********                        #
 * #                ***  ****** *****                       #
 * #                *** *******   ****                      #
 * #               ***  ********** ****                     #
 * #              ****  *********** ****                    #
 * #            *****   ***********  *****                  #
 * #           ******   *** ********   *****                #
 * #           *****   ***   ********   ******              #
 * #          ******   ***  ***********   ******            #
 * #         ******   **** **************  ******           #
 * #        *******  ********************* *******          #
 * #        *******  ******************************         #
 * #       *******  ****** ***************** *******        #
 * #       *******  ****** ****** *********   ******        #
 * #       *******    **  ******   ******     ******        #
 * #       *******        ******    *****     *****         #
 * #        ******        *****     *****     ****          #
 * #         *****        ****      *****     ***           #
 * #          *****       ***        ***      *             #
 * #            **       ****        ****                   #
 */
package day30_practice1

import org.w3c.dom.Image
import org.w3c.dom.Location
import org.w3c.dom.Navigator
import kotlin.browser.document
import kotlin.browser.window

/**
 * 项目名称：03JavaScript
 * 创建人：江心才子
 * 创建时间：2020-03-06 11:09
 * 内容描述：
 * 修改说明：
 */


fun main() {
//    val light: Image = (document.getElementById("light") as Image?)!!
//    light.onclick = {
//        window.alert("onclick $flag")
//        if (flag) {
//            light.src = "src/day30_practice1/img/off.gif"
//            flag = false
//        }else{
//            light.src = "src/day30_practice1/img/on.gif"
//            flag = true
//        }
//    }


//    val title: Element = document.getElementById("title")!!
//    window.alert("我要换标题了...")
//    title.innerHTML = "不识妻美刘强东"

}
var flag = false

fun a() {
    val light: Image = (document.getElementById("light") as Image?)!!
    window.alert("onclick $flag")
    if (flag) {
        light.src = "src/day30_practice1/img/off.gif"
        flag = false
    }else{
        light.src = "src/day30_practice1/img/on.gif"
        flag = true
    }
}