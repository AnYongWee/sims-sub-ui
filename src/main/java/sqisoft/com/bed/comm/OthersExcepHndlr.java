package sqisoft.com.bed.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;

/**
 * @Class Name : EgovSampleOthersExcepHndlr.java
 * @Description : EgovSampleOthersExcepHndlr Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */
public class OthersExcepHndlr implements ExceptionHandler{
	private static final Logger logger = LoggerFactory.getLogger(OthersExcepHndlr.class);
	
	/**
	* @param exception
	* @param packageName
	* @see 개발프레임웍크 실행환경 개발팀
	*/
	@Override
	public void occur(Exception exception, String packageName) {
		logger.debug(" EgovServiceExceptionHandler run...............");
	}
}
