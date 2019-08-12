package com.zh.util

import com.com.wy.UsersService
import com.kero99.wp.service.WpService

/**
  *
  * @author wp
  * @date 2019-08-12 14:36
  *
  */
object UsersToWpUtil {
  implicit def usersToWp(users:UsersService)={
    val wp = new WpService
    println("usersToWp")
    wp
  }
}
