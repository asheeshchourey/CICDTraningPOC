package com.dc.cicdtraningpoc

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LoginUnitTest {

    private fun isLoginSuccessful(email: String, password: String): Boolean {
        return email == "test@example.com" && password == "password"
    }

    @Test
    fun testLoginSuccess() {
        assertTrue(isLoginSuccessful("test@example.com", "password"))
    }

    @Test
    fun testLoginFailure() {
        assertFalse(isLoginSuccessful("wrong@example.com", "wrongpassword"))
    }
}