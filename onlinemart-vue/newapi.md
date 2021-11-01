#### 2.3.1 searchGoods

**接口说明**

搜索商品

**请求方式**

GET

**URL**

```
/api/mall/goods/searchGoods
```

**请求参数**

| 参数名  | 参数类型 | 是否必须 | 说明   |
| ------- | -------- | -------- | ------ |
| keyword | str      | 必须     | 关键字 |

```json
{
    "keyword":"phone"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 商品列表 |

```json
{
	"code": 0,
	"data": [{
		"id": 546,
		"img": "http://115.29.141.32:8084/static/image/1618838668103gaitubao_2_jpg.jpg",
		"name": "iphone 12",
		"price": 7699.0,
	}]
}
```

#### 2.3.3 getGoodsInfo

**接口说明**

获取商品信息.其中商品没有细分规格的话 specs 就为空。

**请求方式**

GET

**URL**

```
/api/mall/goods/getGoodsInfo
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明   |
| ------ | -------- | -------- | ------ |
| goodsId     | integer  | 必须     | 商品id |

```json
?id=2
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明         |
| ------ | -------- | -------- | ------------ |
| code   | integer  | 必须     | 状态码       |
| data   | object   | 必须     | 商品信息     |
| goodsId| integer  | 必须     | 商品id       |
| img    | str      | 必须     | 商品图片     |
| name   | str      | 必须     | 商品名称     |
| desc   | str      | 必须     | 商品描述     |
| specsNum  | integer     | 必须     | 商品规格数量 |
| specs  | list     | 可选     | 商品规格列表 |

```json
{
	"code": 0,
	"data": {
		"goodsId":1,
		"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
		"name": "西服套装的",
		"desc": "新品特卖",
		"specsNum": 5,
		"specs": [{
			"index": 0,
			"specName": "xl",
			"price": 500
		}, {
			"index": 1,
			"specName": "l",
			"price": 500
		}, {
			"index": 2,
			"specName": "m",
			"price": 13
		}, {
			"index": 3,
			"specName": "s",
			"price": 13
		}, {
			"index": 4,
			"specName": "xs",
			"price": 50
		}],
		"price": 10
	}
}
```

### 1.1 getFavList

**接口说明**

获得用户的收藏列表

**请求方式**

GET

**URL**

```
/api/mall/order/getFavList
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户名 |

```json
{
    "username":"user1"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 收藏列表 |

```json
{
	"code": 0,
	"data": [{
        "goodsId": 1,
        "img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
        "name": "西服套装的",
        "price": 500.0
	}, {
        "goodsId": 2,
        "img": "http://115.29.141.32:8084/static/image/161sd54412.jpg",
        "name": "水杯",
        "price": 50.0
	}]
}
```

### 1.3 addToFav

**接口说明**

收藏商品

**请求方式**

POST

**URL**

```
/api/mall/order/addToFav
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username| str    | 必须     | 用户名 |
| goodsId | integer  | 必须     | 商品id |

```json
{
    "username":"user1",
    "goodsId":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```
### 1.2 deleteItemFromFav

**接口说明**

删除收藏的商品

**请求方式**

POST

**URL**

```
/api/mall/order/deleteItemFromFav
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| goodsId | integer  | 必须     | 商品id |

```json
{
    "username":"ser1",
    "goodsId":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```



### 1.3 addToCart

**接口说明**

添加到购物车

**请求方式**

POST

**URL**

```
/api/mall/order/addToCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username| str    | 必须     | 用户名 |
| goodsId | integer  | 必须     | 商品id |
| num | integer  | 必须     | 商品数量 |

```json
{
    "username":"user1",
    "goodsId":1,
	"num":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```

### 2.1 getCartList

**接口说明**

获得用户的购物车列表

**请求方式**

GET

**URL**

```
/api/mall/order/getCartList
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| token  | str      | 必须     | 用户昵称 |

```json
{
    "token":"t"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 购物车列表 |

```json
{
	"code": 0,
	"data": [
		{
			"goodsId": 1,
			"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
			"name": "phone1",
			"seller": "seller1",
			"price": 500.0,
			"num": 1
		},
		{
			"goodsId": 2,
			"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
			"name": "phone2",
			"seller": "seller2",
			"price": 500.0,
			"num": 2
		}
	]
}
```

### 2.2 deleteItemFromCart

**接口说明**

删除收藏的商品

**请求方式**

POST

**URL**

```
/api/mall/order/deleteItemFromCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| index | integer  | 必须     | 商品在购物车中的下标序号 |

```json
{
    "username":"user1",
    "index":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```

### 2.3 changeItemNumInCart

**接口说明**

改变购物车商品数量

**请求方式**

POST

**URL**

```
/api/mall/order/changeItemNumInCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| index | integer  | 必须     | 商品在购物车中的下标序号 |
| num | integer  | 必须     | 新的商品数量 |

```json
{
    "username":"username",
    "index":1,
    "num":10
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息，超出库存数量等 |

```json
{
	"code": 0
}
```

### 2.4 settleAccounts

**接口说明**

结算购物车

**请求方式**

POST

**URL**

```
/api/mall/order/settleAccounts
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| settleList   | list     | 必须     | 购物车里要结算的商品序号列表 |

```json
{
    "code": 0,
    "settleList":[0,2]
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```