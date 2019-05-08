package com.eyunda.tools;


/**
 * 城市信息 
 */
public class AddressData {
	/**不限数组*/
	public static final String NO_LIMITS[] = {"不限"};
	/**省份信息*/
	public static final String PROVINCES[] = {"珠江三角洲流域","珠江东江流域","珠江西江流域","珠江北江流域","珠江漓江流域","珠江桂江流域","珠江浔江流域","珠江黔江流域","珠江红水河流域","珠江北盘江流域","珠江南盘江流域",
		"长江上海流域","长江江苏流域","长江安徽流域","长江江西流域","长江湖北流域","长江湖南流域","长江四川流域","京杭运河流域","黑龙江流域","东北沿海","华北沿海","山东沿海","苏浙沪沿海","福建沿海","粤桂沿海","海南沿海","台港澳沿海","亚洲著名港口","美洲著名港口","欧洲著名港口","非洲著名港口","大洋洲著名港口"};
	/**省份编号数组*/
	public static final int P_ID[] = {11,71,72,73,74,75,76,77,78,79,12,13,14,15,16,21,22,23,31,32,33,34,36,37,41,42,43,44,45,46,50,51};
	/**城市信息*/
	public static final String CITIES[][] = {
        { "三埠港" ,"容奇港" ,"东莞港" ,"肇庆港" ,"佛山港" ,"石龙港" ,"市桥港" ,"太平港" ,"梧州港" ,"南宁港" ,"柳州港","贵港港" },
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        {"暂未港口数据"},
        { "上海县港","嘉定港","宝山港","松江港","金山港","青浦港","奉贤港","南汇港","川沙港","崇明港","上海市区内河港" },
        { "南通市港", "张家港市港", "大中港", "建湖港", "昆山港","兴化港", "江阴港", "高港港", "盐城港", "常熟港", "泰兴港", "东台港", "海安港", "滨海港", "梧桐港", "冉里山港" ,"硖石港", "萧山港", "雉城港", "魏塘港", "小浦港", "周浦港","泗安港", "湖州港", "平湖港", "李家巷港" },
		{"马鞍山港","芜湖港","铜陵港","安庆港","荻港港","池州港","散兵港","合肥港","淮南港","蚌埠港"},
		{"九江港","南昌港","赣州港"},
		{"武穴港","田镇港","黄石港","巴河港","兰溪港","鄂州港","武汉港","沙市港","枝城港","宜昌港","襄樊港","利河口港"},
		{"城陵矶港","岳阳港","常德港","沅江港","津市港","株州港","湘潭港","茅草街港","衡阳港"},
		{"万县港","涪陵港","重庆港","北碚港","奉节港","泸州港","合川港","宜宾港"},
		{"杭州港","苏州港","常州港","邳州港","淮阴港","宜兴港","吴江港","铜山港","淮安港","徐州港"},
		{"哈尔滨港","佳木斯港","沙河子港","富锦港","同江港","黑河港"},
		{"丹东港","大连港","营口港","锦州港"},
		{"秦皇岛港","唐山港","天津港","黄骅港"},
		{"龙口港","烟台港","威海港","张家埠港","青岛港","日照港","石岛港","岚山港"},
		{"连云港港","南通港","张家港港","南京港","上海港","乍浦港","舟山港","石浦港","海门港","镇江港","宁波港","温州港"},
		{"赛岐港","福州港","湄州湾港","厦门港","东山港","泉州港"},
		{"汕头港","西堤港","汕尾港","深圳港","广州港","中山港","珠海港","江门港","阳江港","水东港","湛江港","霞海港","海安港","北海港","防城港"},
		{"海口港","三亚港","八所港","洋浦港","马村港"},
		{"高雄港","花莲港","台中港","基隆港","香港港","澳门港"},
		{"日本横滨港","日本神户港 ","日本千叶港","日本名古屋港","新加坡港","俄罗斯符拉迪沃斯托克港","印度孟买港","巴基斯坦卡拉奇港","也门亚丁港","斯里兰卡科伦坡港","土耳其伊斯坦布尔港"},
		{"美国洛杉矶港","美国旧金山港","加拿大温哥华港","美国纽约港","美国休斯敦港","巴西里约热内卢港","阿根廷布宜诺斯艾利斯港"},
		{"法国马赛港","意大利热那亚港","罗马尼亚康斯坦萨港","荷兰鹿特丹港","比利时安特卫普港","法国勒阿弗尔港","德国汉堡港","英国伦敦港","英国利物浦港","荷兰阿姆斯特丹港","俄罗斯圣彼得堡港","瑞典哥德堡港","葡萄牙里斯本港"},
		{"莫桑比克马普托港","埃及亚历山大港","埃及塞得港","南非开普敦港","利比里亚蒙罗维亚港"},
		{"澳大利亚悉尼港","新西兰奥克兰港"}
	};
	/**城市编号数组*/
	public static final int[][] C_ID = {
		{1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112},
		{7101},
        {7201},
        {7301},
        {7401},
        {7501},
        {7601},
        {7701},
        {7801},
        {7901},
        {1201,1202,1203,1204,1205,1206,1207,1208,1209,1210,1211},
        {1301,1302,1303,1304,1305,1306,1307,1308,1309,1310,1311,1312,1313,1314,1315,1316,1317,1318,1319,1320,1321,1322,1323,1324,1325,1326},
        {1401,1402,1403,1404,1405,1406,1407,1408,1409,1410},
        {1501,1502,1503},
        {1601,1602,1603,1604,1605,1606,1607,1608,1609,1610,1611,1612},
        {2101,2102,2103,2104,2105,2106,2107,2108,2109},
        {2201,2202,2203,2204,2205,2206,2207,2208},
        {2301,2302,2303,2304,2305,2306,2307,2308,2309,2310},
        {3101,3102,3103,3104,3105,3106},
        {3201,3202,3203,3204},
        {3301,3302,3303,3304},
        {3401,3402,3403,3404,3405,3406,3407,3408},
        {3601,3602,3603,3604,3605,3606,3607,3608,3609,3610,3611,3612},
        {3701,3702,3703,3704,3705,3706},
        {4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115},
        {4201,4202,4203,4204,4205},
        {4301,4302,4303,4304,4305,4306},
        {4401,4402,4403,4404,4405,4406,4407,4408,4409,4410,4411},
        {4501,4502,4503,4504,4505,4506,4507},
        {5001,5002,5003,5005,5006,5007,5008,5009,5010,5011,5012,5013},
        {5001,5002,5003,5004,5005},
        {5101,5102}
	};

}