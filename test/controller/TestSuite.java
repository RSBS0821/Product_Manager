package controller;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Sebastian Bermudez
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    controller.homeControllerTest.class,
    dao.ProductoDaoParamTest.class,
    dao.ProductoDaoParam2Test.class,
    dao.ProductoDaoTest.class,
    dao.ConectarDBTest.class})

public class TestSuite {
    
}
