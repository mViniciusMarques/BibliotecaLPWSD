package unitTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.cesjf.bibliotecalpwsd.bean.LoginBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mviniciusmarques
 */
public class LoginTest {
    
    LoginBean loginPage;
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       loginPage = new LoginBean();
    }
    
    @After
    public void tearDown() {
    }

  @Test
  public void testAssertTrue() {
    assertTrue("O parâmetro deve ser true", true);  
  }  
  
 // @Test
  public void loginTest() {
      loginPage.setNome("");
      loginPage.setSenha("");
      try{
         loginPage.login();
      } catch(Exception e) { }
      loginPage.isLoggedIn();
    assertTrue("Esta logado", loginPage.isLoggedIn());  
  }  
}
