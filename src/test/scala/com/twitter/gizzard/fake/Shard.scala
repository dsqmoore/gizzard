package com.twitter.gizzard.fake

trait Shard extends {
  @throws(classOf[Throwable]) def get(k: String): Option[String]
  @throws(classOf[Throwable]) def put(k: String, v: String): String
}
