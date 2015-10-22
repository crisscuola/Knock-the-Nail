package frontend;

import main.AccountService;
import org.jetbrains.annotations.NotNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class AdminPageServletTest {
    @NotNull
    private final AccountService accountService = new AccountService();
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();
    @Test
    public void testDoGet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("password")).thenReturn("admin");
        when(request.getParameter("shutdown")).thenReturn("1000");
        exit.expectSystemExit();
        new AdminPageServlet(accountService).doGet(request, response);
    }
}