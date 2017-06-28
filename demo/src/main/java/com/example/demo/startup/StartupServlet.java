package com.example.demo.startup;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Servlet implementation class StartupServlet
 */
@WebServlet("/StartupServlet")
public class StartupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//@Autowired
	//private CService cService;
	@Autowired
	//private IJobsService jobsServiceImpl;
	//@Autowired
   // private CacheUtil cacheUtil;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	//*public void init(ServletConfig config) throws ServletException {
	/*	// TODO Auto-generated method stub
		System.out.println("cacheService"+cService);
		System.out.println("JobsServiceImpl"+jobsServiceImpl);
		//List<Jobs> jobsList = cService.getALLJobs();
		List<Jobs> jobsList = jobsServiceImpl.findAllJobs();
		LabelValueVO labelValueVO = null;
		List<LabelValueVO> jobsDropdownVOList = new ArrayList<LabelValueVO>();
		for (Jobs job : jobsList) {
			System.out.println(job.toString());
			labelValueVO = new LabelValueVO();
			labelValueVO.setLabelCode(job.getJob_id());
			labelValueVO.setLabelDescrption(job.getJob_title());
			jobsDropdownVOList.add(labelValueVO);
		}
		cacheUtil.setJobsDropDownListVO("JOBS_DROPDOWN","en","US",jobsDropdownVOList);
		List<LabelValueVO> cachejobsDropDownList = cacheUtil.getJobsDropDownListVO("JOBS_DROPDOWN","en","US");
		System.out.println("size"+cachejobsDropDownList.size());
	}

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
