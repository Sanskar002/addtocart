package addtocart;

import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider(name="ProductName")
    private Object[][] getData()
    {
        Object[][] data =  {{"Samsung galaxy s6"},{"Nexus 6"},{"Sony xperia z5"}};
        return data;
    }
}
