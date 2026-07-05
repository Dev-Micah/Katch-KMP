package org.manlabs.katch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform