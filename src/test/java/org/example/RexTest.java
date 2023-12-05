package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RexTest {
    private Rex rex;
    @BeforeEach
    void setUp(){rex = new Rex();}

    @Test
    public void testPhoneNumber() {
        Assertions.assertTrue(rex.PhoneNumber("(+380)50-333-33-33"));
        Assertions.assertFalse(rex.PhoneNumber("(+380)123-45-67"));
        Assertions.assertFalse(rex.PhoneNumber("(+380)50-333-33-339"));
    }

    @Test
    public void testSpaces() {
        String textSpaces = "Я хочу    бути     програмістом";
        String res = "Я хочу бути програмістом";
        Assertions.assertEquals(res, rex.Spaces(textSpaces));
    }

    @Test
    public void testDelHtmlTags() {
        String code = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";
        System.out.println(rex.DelHtmlTags(code));
    }
}