package com.barkibu.api

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Int,
    val name: String
)