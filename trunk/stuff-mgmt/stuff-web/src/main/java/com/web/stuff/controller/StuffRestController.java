package com.web.stuff.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.stuff.model.*;

/**
 * ExplorerController which is the controller class and expose service end-point
 * for accessing explorer services
 * 
 * @author Praveen.puskar
 * 
 */
@Controller
public class StuffRestController {



	private static Logger LOG = Logger.getLogger(StuffRestController.class);

	/**
	 * Retrieves Directory tree as XML SUCCESS : XML containing directory info.
	 * FAILURE : XML containing error description.
	 * 
	 * @param directoryPath
	 * @return ResponseWrapper containing either Directory tree or error
	 *         description if any.
	 */
	@RequestMapping(value = { "stuff" }, method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public ResponseEntity<ResponseWrapper> getDirectoryTree(
			@RequestParam("stuffName") String stuffName) {

		LOG.debug("Request came for getDirectoryTree.");
		LOG.debug("Got Request for path :" + stuffName);
		ResponseWrapper infoToSend = new InfoResponse(1231,"Hello world !"+stuffName);
		LOG.debug("getDirectoryTree: sending response now.");
		return new ResponseEntity<ResponseWrapper>(infoToSend, HttpStatus.OK);
	}

}
