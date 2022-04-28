package hrp.onboarding.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilTest {

    @Test
    @DisplayName("문자열 숫자에 대한 Integer Parse 테스트")
    void test01(){
        assertEquals(3, NumberUtil.parseInt("3"));
        assertEquals(0, NumberUtil.parseInt("문자열"));
    }
}