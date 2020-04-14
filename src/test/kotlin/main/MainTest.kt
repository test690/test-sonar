package main

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun `test addition`() {
        // Arrange
        val x = 5
        val y = 6

        // Act
        val z = add(x, y)

        // Assert
        assertThat(z).isEqualTo(x + y)
    }

    @Test
    fun `test subtraction`() {
        // Arrange
        val x = 5
        val y = 6

        // Act
        val z = sub(x, y)

        // Assert
        assertThat(z).isEqualTo(x - y)
    }
}