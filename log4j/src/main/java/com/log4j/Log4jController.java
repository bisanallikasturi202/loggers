package com.log4j;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Log4jController {

	private static Logger logger = Logger.getLogger(Log4jController.class);

	@RequestMapping("/Message.do")
	public String getMessage() {
		logger.info("inside message()....of" + this.getClass().getCanonicalName());

		logger.trace("Trace message---> inside message()....");
		logger.debug("debug message--> inside message()....");

		logger.warn("warn message--> inside message()....");
		logger.error("error massage--> inside message()....");
		logger.fatal("fatal message--> inside message()....");
		try {
			Integer.parseInt("3241hc43");
		} catch (NumberFormatException e) {
			logger.error("Exception occred");
		}
		System.out.println("inside getmessage().......");
		return "Message.jsp";
	}

}
