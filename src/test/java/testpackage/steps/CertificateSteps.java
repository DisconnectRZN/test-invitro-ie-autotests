package testpackage.steps;

import cucumber.api.java.en.When;
import testpackage.pages.CertificatePage;

public class CertificateSteps {
    CertificatePage page;

    @When("Открыть страницу сертификатов")
    public void clickLicense() {
        page.clickLicense();
    }

    @When("Проверить лицензиии по годам")
    public void checkLicensesByYears() {
        page.checkLicensesByYears();
    }
}
