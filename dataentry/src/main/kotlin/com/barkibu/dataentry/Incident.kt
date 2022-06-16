package com.barkibu.dataentry

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Incident(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Int,
    val name: String
)