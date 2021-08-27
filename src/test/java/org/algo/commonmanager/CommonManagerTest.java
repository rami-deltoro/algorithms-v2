package org.algo.commonmanager;

import org.junit.jupiter.api.Test;

class CommonManagerTest {

    CommonManager commonManager = new CommonManager();

    @Test
    void testLowestCommonManager() {
        Person personA = new Person("A");
        Person personB = new Person("B");
        Person personC = new Person("C");
        Person personD = new Person("D");
        Person personE = new Person("E");
        Person personF = new Person("F");
        Person personG = new Person("G");
        Person personH = new Person("H");
        Person personI = new Person("I");

        personA.addReport(personB);
        personA.addReport(personC);


        personB.addReport(personF);


        personC.addReport(personD);
        personC.addReport(personE);

        personD.addReport(personG);
        personD.addReport(personH);
        personD.addReport(personI);




        OrgInfo orgInfo = commonManager.getLowestCommonManager(personA,personG,personI);

        System.out.println(orgInfo.getLowestCommonManager().getName());

    }



}