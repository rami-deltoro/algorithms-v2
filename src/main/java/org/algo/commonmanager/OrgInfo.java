package org.algo.commonmanager;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrgInfo {

    private final Person lowestCommonManager;
    private final int numReports;

}
