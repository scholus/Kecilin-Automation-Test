package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object offline_pssi_dashboard_url
     
    /**
     * <p></p>
     */
    public static Object cctvIdInvalid
     
    /**
     * <p></p>
     */
    public static Object cctvNameInvalid
     
    /**
     * <p></p>
     */
    public static Object cctvRTSPInvalid
     
    /**
     * <p></p>
     */
    public static Object cctvIdEmpty
     
    /**
     * <p></p>
     */
    public static Object nameEmpty
     
    /**
     * <p></p>
     */
    public static Object rtspEmpty
     
    /**
     * <p></p>
     */
    public static Object negativeTestPassedErrorMessageAppear
     
    /**
     * <p></p>
     */
    public static Object negativeTestFailedUserRedirToOtherPage
     
    /**
     * <p></p>
     */
    public static Object negativeTestPassedCannotSaveCCTVEmptyMandatory
     
    /**
     * <p></p>
     */
    public static Object negativeTestPassedDataNotAdded
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            offline_pssi_dashboard_url = selectedVariables['offline_pssi_dashboard_url']
            cctvIdInvalid = selectedVariables['cctvIdInvalid']
            cctvNameInvalid = selectedVariables['cctvNameInvalid']
            cctvRTSPInvalid = selectedVariables['cctvRTSPInvalid']
            cctvIdEmpty = selectedVariables['cctvIdEmpty']
            nameEmpty = selectedVariables['nameEmpty']
            rtspEmpty = selectedVariables['rtspEmpty']
            negativeTestPassedErrorMessageAppear = selectedVariables['negativeTestPassedErrorMessageAppear']
            negativeTestFailedUserRedirToOtherPage = selectedVariables['negativeTestFailedUserRedirToOtherPage']
            negativeTestPassedCannotSaveCCTVEmptyMandatory = selectedVariables['negativeTestPassedCannotSaveCCTVEmptyMandatory']
            negativeTestPassedDataNotAdded = selectedVariables['negativeTestPassedDataNotAdded']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
