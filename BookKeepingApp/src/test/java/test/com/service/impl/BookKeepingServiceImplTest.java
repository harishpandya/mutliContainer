package test.com.service.impl;

import com.service.BookKeepingService;
import com.service.impl.BookKeepingServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;


class BookKeepingServiceImplTest {


    @Test
    public void whenGetTodaysThenValidateResult(){

        BookKeepingService bookKeepingService = new BookKeepingServiceImpl();
        assertEquals(10001,bookKeepingService.getTodaysSell(1));
        assertEquals(10002,bookKeepingService.getTodaysSell(2));
        assertEquals(10003,bookKeepingService.getTodaysSell(3));
        assertEquals(10004,bookKeepingService.getTodaysSell(4));
        assertEquals(10005,bookKeepingService.getTodaysSell(5));
        assertEquals(10006,bookKeepingService.getTodaysSell(6));
        assertEquals(10007,bookKeepingService.getTodaysSell(7));
    }

}