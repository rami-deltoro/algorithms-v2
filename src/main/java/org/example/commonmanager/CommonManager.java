package org.example.commonmanager;

public class CommonManager {

    public OrgInfo getLowestCommonManager(final Person topManager,final  Person reportOne,final  Person reportTwo) {
        return getOrgInfo(topManager,reportOne,reportTwo);
    }

    private OrgInfo getOrgInfo(final Person manager,final  Person reportOne,final  Person reportTwo) {
        int numImportantReports = 0;

        for(Person directReport : manager.getDirectReports()) {
            OrgInfo orgInfo = getOrgInfo(directReport, reportOne, reportTwo);
            if(orgInfo.getLowestCommonManager()!=null) {
                return orgInfo;
            }
            numImportantReports += orgInfo.getNumReports();
        }

        if(manager.equals(reportOne) || manager.equals(reportTwo)) {
            numImportantReports++;
        }

        Person lowestCommonManager = numImportantReports == 2 ? manager : null;

        return new OrgInfo(lowestCommonManager,numImportantReports);
    }

}
