/*
 * 
 * 文件名：ExcelUtil.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：
 * 修改人：肖崇高
 * 修改时间：2014年3月21日
 * 修改内容：
 */
 
package cn.picc.util.excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;

import cn.picc.model.Department;
import cn.picc.model.ExcelObject;
import cn.picc.model.Organization;


/**
 * @author 肖崇高
 * @version 1.0, 2014年3月21日
 */
public class ExcelUtil {
	
	public final static String URL = "jdbc:oracle:thin:@192.168.1.125:1521:orcl";
	
	public final static String USERNAME = "PICCHR";
	
	public final static String PASSWORD = "1234567890";
	
	/**列名*/
    private String[] colnumName;
    /**列类型*/
    private Integer[] colnumType;
    /**代码KV*/
    private HashMap<String,Object> codeType;
    /**写入到的Object类型,该方法必须继承ExcelObj才可以使用*/
    private ExcelObject excelObj;
 
    /**
     * 获取excel到一个List<List<HashMap<String,Object>>>，从第一个sheet页的第一行开始读取
     * 从外到内依次为：sheet页,行,单元格
     * @param file 要读取的文件
     * @return 返回一个List<List<HashMap<String,Object>>>对象
     * @throws Exception
     */
    public List<List<HashMap<String,Object>>> getExcel(File file) throws Exception {
        return getExcel(file,0,0);
    }
     
    /**
     * 获取excel到一个List<List<HashMap<String,Object>>>
     * 从外到内依次为：sheet页,行,单元格
     * @param file 要读取的文件
     * @param snum 读取那个sheet页,从0算起
     * @param rnum 从那行开始读取,从0算起
     * @return 返回一个List<List<HashMap<String,Object>>>对象
     * @throws Exception
     */
    public List<List<HashMap<String, Object>>> getExcel(File file,int snum,int rnum) throws Exception {
        List<List<HashMap<String, Object>>> list = new ArrayList<List<HashMap<String, Object>>>();
        //Object localObject = null;
        // 传入路径
        FileInputStream is = new FileInputStream(file);
        Workbook wbs = WorkbookFactory.create(is);
        int sheetNum = wbs.getNumberOfSheets();
        //拿到所有合并了的单元格
      	//this.addressList = getAllMegredCells(wbs);
        //System.out.println("childSheet = "+childSheet.getLastRowNum());
        for(int i=0;i<sheetNum;i++){
        	Sheet childSheet = (Sheet) wbs.getSheetAt(i);
	        for (int j = rnum; j <= childSheet.getLastRowNum(); j++) {
	            //读取行元素
	            List<HashMap<String, Object>> listrow = new ArrayList<HashMap<String, Object>>();
	            Row row = childSheet.getRow(j);
	            // System.out.println("row = "+row);
	            if (null != row) {
	                HashMap<String, Object> cellv = null;
	                // System.out.println("lastCellNum = "+row.getRowNum());
	                for (int k = 0; k < row.getLastCellNum(); k++) {
	                    //读取单元格
	                    Cell cell = row.getCell((short) k);
	                    cellv = new HashMap<String, Object>();
	                    if(cell != null&&!isNullCell(cell)){
	                        // 获取单元格的内容
	                    	String localObject = readCell(cell);
	                        cellv.put(colnumName[k], localObject);
	                        listrow.add(cellv);
	                    }
	                }
	                list.add(listrow);
	            }
	        }
        }
        return list;
    }
    /**
     * 解析excel（导入基础数据）
     * @param file 要读取的文件
     * @param rnum 从那行开始读取,从0算起
     * @param cnum 从哪列开始读取,从0开始
     * @return
     * @throws Exception
     */
    public List<List<List<Object>>> parseExcel(File file,int rnum,int cnum) throws Exception {
    	List<List<List<Object>>> result = new ArrayList<List<List<Object>>>();
    	// 传入路径
        FileInputStream is = new FileInputStream(file);
        //获得工作区
        Workbook wbs = WorkbookFactory.create(is);
        //获得excel的sheet数
        int sheetNum = wbs.getNumberOfSheets();
        for(int i=0;i<sheetNum;i++){//循环获取sheet
        	Sheet childSheet = (Sheet) wbs.getSheetAt(i);
        	List<List<Object>> listrow = new ArrayList<List<Object>>();
	        for (int j = rnum; j <= childSheet.getLastRowNum(); j++) {//循环读取每一行
	            //读取行元素
	            Row row = childSheet.getRow(j);
	            if (null != row) {
	                List<Object> cellv = new ArrayList<Object>();
	                // System.out.println("lastCellNum = "+row.getRowNum());
	                for (int k = cnum; k < row.getLastCellNum(); k++) {//循环读取每行的单元格
	                    //读取单元格
	                    Cell cell = row.getCell(k);
	                    if(cell != null){
	                        // 获取单元格的内容
	                    	Object localObject = contentCell(cell);
	                        cellv.add(localObject);
	                    }
	                }
	               listrow.add(cellv);
	            }
	        }
	        result.add(listrow);
        }
    	return result;
    }
    
    public static List<List<Object>> parseExcel(File file,int snum,int rnum,int cnum) throws Exception {
    	List<List<Object>> result = new ArrayList<List<Object>>();
    	// 传入路径
        FileInputStream is = new FileInputStream(file);
        //获得工作区
        Workbook wbs = WorkbookFactory.create(is);
        //获得excel的sheet数
        //int sheetNum = wbs.getNumberOfSheets();
        //for(int i=0;i<sheetNum;i++){//循环获取sheet
        	Sheet childSheet = (Sheet) wbs.getSheetAt(snum);
        	//List<List<Object>> listrow = new ArrayList<List<Object>>();
	        for (int j = rnum; j <= childSheet.getLastRowNum(); j++) {//循环读取每一行
	            //读取行元素
	            Row row = childSheet.getRow(j);
	            if (null != row) {
	                List<Object> cellv = new ArrayList<Object>();
	                // System.out.println("lastCellNum = "+row.getRowNum());
	                for (int k = cnum; k < row.getLastCellNum(); k++) {//循环读取每行的单元格
	                    //读取单元格
	                    Cell cell = row.getCell(k);
	                    if(cell != null){
	                        // 获取单元格的内容
	                    	Object localObject = contentCell(cell);
	                        cellv.add(localObject);
	                    }
	                }
	                result.add(cellv);
	            }
	        //}
	       // result.add(listrow);
        }
    	return result;
    }
    
    /**
     * 按列的方式读取excel
     * @param snum 要读取的sheet
     * @param file 要读取的文件
     * @param rnum 从那行开始读取,从0算起
     * @param cnum 从哪列开始读取,从0开始
     * @return List<List<Object>>由外向内依次为：sheet(列集合) 列(某列单元格集合)  单元格
     * @throws Exception
     */
    public static List<List<Object>> parseExcelByColumn(File file,int snum,int rnum,int cnum) throws Exception {
    	List<List<Object>> list = new ArrayList<List<Object>>();
    	// 传入路径
        FileInputStream is = new FileInputStream(file);
        //获得工作区
        Workbook wbs = WorkbookFactory.create(is);
        //获得excel的sheet数
    	Sheet childSheet = (Sheet) wbs.getSheetAt(snum);
    	//所有的列数
    	int cols = childSheet.getRow(0).getLastCellNum()-cnum;
    	for(int i=0;i<cols;i++){
    		List<Object> str = new ArrayList<Object>();
    		list.add(str);
    	}
    	System.out.println("cols = "+cols);
		for (int j = rnum; j <=childSheet.getLastRowNum(); j++) {//循环读取每一行
            //读取行元素
            Row row = childSheet.getRow(j);
            if (null != row) {
                for (int k = cnum; k < row.getLastCellNum(); k++) {//循环读取每行的单元格
                    //读取单元格
                    Cell cell = row.getCell(k);
                    if(cell != null){
                        // 获取单元格的内容
                    	Object localObject = contentCell(cell);
                    	if(cnum>0){
                    		list.get(k-cnum).add(j-rnum, localObject);
                    	}else{
                    		list.get(k).add(j, localObject);
                    	}
                    	
                    }
                }
            }
        }
    	return list;
    }
    
    /**
	 * 计算起始点离Excel的宽度
	 */
	public  double getWidthDistanceToExcel(Sheet sheet  , int firstCol){
		double width = 0.0; 
		for(int i = 0; i < firstCol ; i++){
			//idth +=HSSFUtil.fromHSSFWidth(sheet.getColumnWidth(i));
		}
		return  width;
	}
    
    /**
	 * 返回工作簿workBook中的所有合并了的单元格的位置集合
	 * @param wb
	 * @return
	 */
	public List<CellRangeAddress> getAllMegredCells(Workbook wb){
		List<CellRangeAddress> addressList = new ArrayList<CellRangeAddress>();
		int numOfSheet = wb.getNumberOfSheets();//工作表的个数
		Sheet sheet = null;
		for (int i = 0; i < numOfSheet; i++) {
			//拿到每一个sheet
			sheet = wb.getSheetAt(i);
			
			//拿到当前sheet里面的合并单元格的个数（位置）
			int numOfMerges = sheet.getNumMergedRegions();
			CellRangeAddress address = null;
			for (int j = 0; j < numOfMerges; j++) {
				
				//拿到每一个合并的单元格的位置属性
				address = sheet.getMergedRegion(j);
				addressList.add(address);
			}
		}//end of for
		return addressList;
	}

	/**
	 * 判断该单元格是否是合并了的单元格。
	 * @param addressList
	 * @param cell
	 * @return
	 */
	public  boolean isMegred(List<CellRangeAddress> addressList , Cell cell){
		
		if(cell!=null){
			int rowIndex = cell.getRowIndex();
			int colIndex = cell.getColumnIndex();
			
			CellRangeAddress address = null;
			for (int i = 0; i < addressList.size(); i++) {
				//拿到每一个单元格
				address =  addressList.get(i);
				
				int firstRow = address.getFirstRow();
				int lastRow = address.getLastRow();
				int firstCol = address.getFirstColumn();
				int lastCol = address.getLastColumn();
				
//				System.out.println("firstRow == " + firstRow+"   lastRow == " + lastRow);
//				System.out.println("firstCol == " + firstCol+"   lastCol == " + lastCol);
				
				if(rowIndex>=firstRow&&rowIndex<=lastRow&&colIndex>=firstCol&&colIndex<=lastCol){
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * 判断该cell是不是在合并单元格的第一个
	 * @param addressList
	 * @param cell
	 * @return
	 */
	public boolean isFirstCellInMegre(List<CellRangeAddress> addressList,Cell cell){
		CellRangeAddress address = null;
		for (int i = 0; i < addressList.size(); i++) {
			address = addressList.get(i);
			//但当前的cell的行和列等于该合并单元格的左上角单元格是，说明是第一个。
			if(cell.getRowIndex()==address.getFirstRow()&&cell.getColumnIndex()==address.getFirstColumn()){
				return true;
			}//end of if
		}
		return false;
	}
	
	/**
	 * 返回当前的cell在的合并域地址信息
	 * 当前cell是某个合并单元格的第一个cell了（先调用isFirstCellInMegre函数判断）
	 * @param addressList
	 * @param cell
	 * @return
	 */
	public CellRangeAddress getAddressOfMegre(List<CellRangeAddress> addressList,Cell cell){
		CellRangeAddress address = null;
		for (int i = 0; i < addressList.size(); i++) {
			address = addressList.get(i);
			if(cell.getRowIndex()==address.getFirstRow()&&cell.getColumnIndex()==address.getFirstColumn()){
				return address;
			}//end of if
		}//end of for
		return null;
	}
    
	/**
	 * 判断该单元格cell是否是空单元格。
	 * @param cell
	 * @return
	 */
	public boolean isNullCell(Cell cell){
		//拿到cell的内容
		String value = readCell(cell);
//		System.out.println("value = "+value);
		if(value!=null&&!(value.trim().equals("null"))&&!(value.equals(""))&&value.trim().length()>0){
			return false;//不是空值
		}else{
			return true;//是空值
		}
	}
	
	/**
	 * 读取一个单元格的内容。
	 * @param cell
	 */
	public static Object contentCell(Cell cell) {
		Object value = null;
		switch (cell.getCellType()) {
		
		case Cell.CELL_TYPE_NUMERIC: // 数值型
			if (DateUtil.isCellDateFormatted(cell)) {
				// 如果是date类型则 ，获取该cell的date值
				value = DateUtil.getJavaDate(cell.getNumericCellValue())
						;
			} else {// 纯数字
				value = (int)cell.getNumericCellValue();
			}
			break;
		/* 此行表示单元格的内容为string类型 */
		case Cell.CELL_TYPE_STRING: // 字符串型
			value = cell.getRichStringCellValue().toString();
			break;
		case Cell.CELL_TYPE_FORMULA:// 公式型
			// 读公式计算值
			value = String.valueOf(cell.getNumericCellValue());
			if (value.equals("NaN")) {// 如果获取的数据值为非法值,则转换为获取字符串
				value = cell.getRichStringCellValue().toString();
			}
			// cell.getCellFormula();读公式
			break;
		case Cell.CELL_TYPE_BOOLEAN:// 布尔
			value = cell.getBooleanCellValue();
			break;
		/* 此行表示该单元格值为空 */
		case Cell.CELL_TYPE_BLANK: // 空值
			value = null;
			break;
		case Cell.CELL_TYPE_ERROR: // 故障
			value = "error";
			break;
		default:
			value = cell.getRichStringCellValue().toString();
		}
		return value;
	}
	
	/**
	 * 读取一个单元格的内容。
	 * @param cell
	 */
	public String readCell(Cell cell) {
		String value = "";
		switch (cell.getCellType()) {
		
		case Cell.CELL_TYPE_NUMERIC: // 数值型
			if (DateUtil.isCellDateFormatted(cell)) {
				// 如果是date类型则 ，获取该cell的date值
				value = DateUtil.getJavaDate(cell.getNumericCellValue())
						.toString();
			} else {// 纯数字
				
				value = String.valueOf((int)cell.getNumericCellValue());
			}
			break;
		/* 此行表示单元格的内容为string类型 */
		case Cell.CELL_TYPE_STRING: // 字符串型
			value = cell.getRichStringCellValue().toString();
			break;
		case Cell.CELL_TYPE_FORMULA:// 公式型
			// 读公式计算值
			value = String.valueOf(cell.getNumericCellValue());
			if (value.equals("NaN")) {// 如果获取的数据值为非法值,则转换为获取字符串

				value = cell.getRichStringCellValue().toString();
			}
			// cell.getCellFormula();读公式
			break;
		case Cell.CELL_TYPE_BOOLEAN:// 布尔
			value = " " + cell.getBooleanCellValue();
			break;
		/* 此行表示该单元格值为空 */
		case Cell.CELL_TYPE_BLANK: // 空值
			value = "";
			break;
		case Cell.CELL_TYPE_ERROR: // 故障
			value = "";
			break;
		default:
			value = cell.getRichStringCellValue().toString();
		}
		
		return value;
	}
 
    /**
     * 获取excel到一个List<List<HashMap<String,Object>>>
     * @param filepath Excel文件路径
     * @return 返回一个List<List<HashMap<String,Object>>>对象
     * @throws Exception
     */
    public List<List<HashMap<String, Object>>> getExcel(String filepath) throws Exception {
        File file = new File(filepath);
        return getExcel(file,0,0);
    }
    /**
     * 获取excel到一个List<List<HashMap<String,Object>>>
     * @param filepath Excel文件路径
     * @param snum 读取那个sheet页,从0算起
     * @param rnum 从那行开始读取,从0算起
     * @return 返回一个List<List<HashMap<String,Object>>>对象
     * @throws Exception
     */
    public List<List<HashMap<String, Object>>> getExcel(String filepath,int snum,int rnum) throws Exception {
        File file = new File(filepath);
        return getExcel(file,snum,rnum);
    }
     
    /**
     * 读取到excel到List<Object>从第一个sheet页的第一行开始读取
     * @param file 要读取的文件
     * @return 返回一个List<Object>对象
     * @throws Exception
     */
    public List<Object> getExcelObj(File file) throws Exception{
        return getExcelObj(file,0,0);
    }
     
    /**
     * 读取到excel到List<Object>
     * @param file 要读取的文件
     * @param snum 读取那个sheet页,从0算起
     * @param runm 从那行开始读取,从0算起
     * @return 返回一个List<Object>对象
     * @throws Exception
     */
    public List<Object> getExcelObj(File file,int snum,int runm) throws Exception{
        List<Object> list = new ArrayList<Object>();
        Class c = excelObj.getClass();
        ExcelObject dto = null;
        List<List<HashMap<String, Object>>> exceldata = getExcel(file,snum,runm);
        if(exceldata!=null){
             for(List<HashMap<String, Object>> lista:exceldata){
                 dto = (ExcelObject)c.newInstance();
                 //dto.putValue("ErrMsg","");
                 for(int iii=0;iii<lista.size();iii++){
                     HashMap<String, Object> hm = lista.get(iii);
                     if(hm.get(colnumName[iii])!=null){
                         dto.putValue(colnumName[iii], hm.get(colnumName[iii]));
                     }
                     else{
                         //dto.putValue("ErrMsg", dto.outValue("ErrMsg")+"第"+(iii+1)+"列存在为空的值;");
                         continue;
                     }
                 }
                 list.add(dto);
             }
        }
        return list;
    }
     
    /**
     * 读取到excel到List<Object>
     * @param filepath Excel文件路径
     * @return 返回一个List<Object>对象
     * @throws Exception
     */
    public List<Object> getExcelObj(String filepath) throws Exception{
        File file = new File(filepath);
        return getExcelObj(file,0,0);
    }
    /**
     * 读取到excel到List<Object>
     * @param filepath Excel文件路径
     * @param snum
     * @param runm
     * @return 返回一个List<Object>对象
     * @throws Exception
     */
    public List<Object> getExcelObj(String filepath,int snum,int runm) throws Exception{
        File file = new File(filepath);
        return getExcelObj(file,snum,runm);
    }
   /**
    * 批量插入数据 
    * @param file
    * @param snum
    * @param rnum
    * @param cnum
    */
    public void batchInsert(File file,int snum,int rnum,int cnum){
		List<Organization> postList = new ArrayList<Organization>();
		List<Department> deptList = new ArrayList<Department>();
		List<List<Object>> list = null;
		try {
			list = parseExcel(file, snum, rnum, cnum);
			System.out.println("list的大小"+list.size());
			for(int i=0;i<list.size();i++){//所有的行
				List<Object> obj = list.get(i);//第i行
				String isSon = (String)obj.get(8);
				if(isSon==null||"".equals(isSon)||"Y".equals(isSon)){//分公司及支公司经营单位
					Organization org = new Organization();
					org.setModifyTime(new Date());
					org.setOrgCode(String.valueOf(obj.get(4)));
					org.setOrgName(String.valueOf(obj.get(5)));
					org.setProfKey(String.valueOf(obj.get(6)));
					postList.add(org);
				}else{//部门
					Department dept = new Department();
					dept.setModifyTime(new Date());
					dept.setDeptCode(String.valueOf(obj.get(4)));
					dept.setDeptName(String.valueOf(obj.get(5)));
					dept.setIsSonunit(String.valueOf(obj.get(8)));
					dept.setProfKey(String.valueOf(obj.get(6)));
					dept.setProfCode(String.valueOf(obj.get(7)));
				}
 			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    
     
    
    public ExcelObject getExcelObj() {
		return excelObj;
	}

	public void setExcelObj(ExcelObject excelObj) {
		this.excelObj = excelObj;
	}

	public String[] getColnumName() {
        return colnumName;
    }
 
    public void setColnumName(String[] colnumName) {
        this.colnumName = colnumName;
    }
 
    public Integer[] getColnumType() {
        return colnumType;
    }
 
    public void setColnumType(Integer[] colnumType) {
        this.colnumType = colnumType;
    }
     
    public HashMap<String, Object> getCodeType() {
        return codeType;
    }
 
    public void setCodeType(HashMap<String, Object> codeType) {
        this.codeType = codeType;
    }
	
}
