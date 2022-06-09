Halo, nama saya Azila Nuzwar. Berikut adalah tugas ketika bootcamp QA Automation di Jakarta Labs dengan pengajarnya adalah Mas Andro.

# Tugas 1
Deskripsi tugas: Membuat treemap dan treeset dengan minimum tiga anggota

- TugasTreeMap : [src/main/java/tugasminggu1dan2/TugasTreeMap.java](./src/main/java/tugasminggu1dan2/TugasTreeMap.java)
- TugasTreeSet : [src/main/java/tugasminggu1dan2/TugasTreeSet.java](./src/main/java/tugasminggu1dan2/TugasTreeSet.java)

# Tugas 2
Deskripsi tugas: Membuat kalkulator dengan metode try catch dengan object oriented. Dimana jika kita input string, program tetap berjalan meskipun error.

- TugasKalkulator : [src/main/java/tugasminggu1dan2/TugasKalkulator.java](./src/main/java/tugasminggu1dan2/TugasKalkulator.java)

# Tugas 3
Deskripsi tugas: Membuat automation test hingga finish dengan POM atau page factory pada saucedemo.com.

Tugas yang sementara ini bisa saya kerjakan adalah dengan metode POM (Page Object Model). 

a. Main 
- BasePage : [src/main/java/cobaqaautomation/cobamay2022/pages/CobaBasePage.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaBasePage.java)
- LoginPage : [src/main/java/cobaqaautomation/cobamay2022/pages/CobaLoginPage.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaLoginPage.java)
- InventoryPage : [src/main/java/cobaqaautomation/cobamay2022/pages/CobaInventoryPage.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaInventoryPage.java)
- CartPage : [src/main/java/cobaqaautomation/cobamay2022/pages/CobaCartPage.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaCartPage.java)
- CheckOutStep1Page : [src/main/java/cobaqaautomation/cobamay2022/pages/CobaCheckOutStep1Page.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaCheckOutStep1Page.java)
- CheckOutStep2Page : [src/main/java/cobaqaautomation/cobamay2022/pages/CobaCheckOutStep2Page.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaCheckOutStep2Page.java)
- CommonPage :[src/main/java/cobaqaautomation/cobamay2022/pages/CobaCommonPage.java](./src/main/java/cobaqaautomation/cobamay2022/pages/CobaCommonPage.java)

b. Test
- BaseWebTest : [src/test/java/cobaqaautomation/cobamay2022/CobaBaseWebTest.java](./src/test/java/cobaqaautomation/cobamay2022/CobaBaseWebTest.java)
- CommonTest, yang bisa di run as testNG : [src/test/java/cobaqaautomation/cobamay2022/CobaCommonTest.java](./src/test/java/cobaqaautomation/cobamay2022/CobaCommonTest.java)
- WebTestAfterPOM, yang bisa di run as testNG : [linksrc/test/java/cobaqaautomation/cobamay2022/CobaWebTestAfterPOM.java](./src/test/java/cobaqaautomation/cobamay2022/CobaWebTestAfterPOM.java)

# Tugas 4
Deskripsi tugas: Membuat automation test pada yopmail.com, yang bisa switch to iframe inbox, get text inbox dan syso untuk melihat hasilnya 

a. Main
- BasePage : [src/main/java/cobaqaautomation/cobamay2022/yopmailpages/YopmailBasePage.java](./src/main/java/cobaqaautomation/cobamay2022/yopmailpages/YopmailBasePage.java)
- LoginPage : [src/main/java/cobaqaautomation/cobamay2022/yopmailpages/YopmailLoginPage.java](./src/main/java/cobaqaautomation/cobamay2022/yopmailpages/YopmailLoginPage.java)

b. Test 
- BaseWebTest : [src/test/java/cobaqaautomation/cobamay2022/yopmail/BaseWebTest.java](./src/test/java/cobaqaautomation/cobamay2022/yopmail/BaseWebTest.java)
- WebTestAfterPOM, yang bisa di run as testNG : [src/test/java/cobaqaautomation/cobamay2022/yopmail/WebTestAfterPOM.java](./src/test/java/cobaqaautomation/cobamay2022/yopmail/WebTestAfterPOM.java)

# Tugas 5
Deskripsi tugas: Membuat automation test dengan menggunakan rest assured, juga menggunakan faker untuk menghasilkan username dan email. Assert statusnya adalah 'created' dan status code nya adalah 201. 

- BaseAPITest : [src/test/java/cobaqaautomation/cobamay2022/TugasBaseAPITest.java](./src/test/java/cobaqaautomation/cobamay2022/TugasBaseAPITest.java)
- RegisterKolak, yang bisa di run as testNG : [src/test/java/cobaqaautomation/cobamay2022/TugasRegisterKolak.java](./src/test/java/cobaqaautomation/cobamay2022/TugasRegisterKolak.java)
- APITestAfterRefactor : [src/main/java/cobaqaautomation/cobamay2022/pages/TugasAPITestAfterRefactor.java](./src/test/java/cobaqaautomation/cobamay2022/TugasAPITestAfterRefactor.java)

# Tugas 6
Deskripsi tugas: Upload tugas 1-5 di Github. 

- Tugas ini dikumpulkan pada repository ini.

# Tugas 7
Deskripsi tugas: upload screenshot hasil console repository di Github menggunakan Jenkins. 

- Maven test repository ini : [maventest_jenkins.jpeg](./maventest_jenkins.jpeg)
