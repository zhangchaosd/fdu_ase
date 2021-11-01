## 1.1 getCredits

**接口说明**

获得用户余额

**请求方式**

GET

**URL**

```
/api/mall/getCredits
```

**请求参数**

| 参数名  | 参数类型 | 是否必须 | 说明   |
| ------- | -------- | -------- | ------ |
| username | str      | 必须     | 用户名 |

```json
{
    "username":"user1"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   |       | 必须     |  |
| credits   |       | 必须     | 余额 |

```json
{
	"code": 0,
	"data": {
		"credits": 999,
	}
}
```

## 1.2 addCredits

**接口说明**

充值

**请求方式**

POST

**URL**

```
/api/mall/addCredits
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username| str    | 必须     | 用户名 |
| creditsChange | integer  | 必须     | 充值金额 |

```json
{
    "username":"user1",
    "creditsChange":100
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


## 2.1 searchGoods

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

## 2.2 getGoodsInfo

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
| price   | str      | 必须     | specsNum为0时使用这个价格     |
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
		"price": 10,
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
		}]
	}
}
```

## 3.1 getFavList

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

## 3.2 addToFav

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
## 3.3 deleteItemFromFav

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



### 4.1 addToCart

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
| specIndex | integer  | 可选     | 商品规格index |

```json
{
    "username":"user1",
    "goodsId":1,
	"num":1,
	"specIndex":0
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

## 4.2 getCartList

**接口说明**

获得用户的购物车列表。其中 specName 对应商品规格名称，没有则为空

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
          "num": 1,
          "specName": "16G + 512G"
        },
        {
          "goodsId": 2,
          "img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
          "name": "phone2",
          "seller": "seller2",
          "price": 500.0,
          "num": 2,
          "specName": ""
        }
	]
}
```

## 4.3 deleteItemsFromCart

**接口说明**

删除收藏的商品

**请求方式**

POST

**URL**

```
/api/mall/order/deleteItemsFromCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| deleteList | list  | 必须     | 商品在购物车中的下标序号列表 |

```json
{
	"username":"user1",
    "deleteList":[0,2]
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

## 4.4 changeItemNumInCart

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

## 4.5 settleAccounts

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
| username   | str     | 必须     | 用户名 |
| settleList   | list     | 必须     | 购物车里要结算的商品序号列表 |

```json
{
	"username":"user1",
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

## 5.1 getOrderByState

**接口说明**

根据订单状态获取订单
-1：'全部订单',
0：'待付款',
1：'待发货',
2：'已发货',
3：'已完成',
4：'已取消'

**请求方式**

GET

**URL**

```
/api/mall/order/getOrderByState
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str  | 必须     | 用户名 |
| state  | integer      | 必须     | 订单状态 |

```json
{
	"username":"username",
    "state":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 订单列表 |

```json
{
	"code": 0,
	"data":{ 
		"orderId":10,
		"state":0,
		"createtime": "2021-04-20 20:40:30",
		"amount": 1500,
		"subOrders":
		[{
			"orderId": 1811,
			"goodsNum": 2,
			"amount": 1000,
			"seller": "seller1",
			"goods": [{
				"goodsId": 476,
				"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
				"name": "西服套装的",
				"specName": "16G + 512G",
				"price": 500,
				"num":1
			},
			{
				"goodsId": 479,
				"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
				"name": "西服套装的22222222222222",
				"specName": "",
				"price": 500,
				"num":1
			}]
		}, {
			"orderId": 1812,
			"goodsNum": 1,
			"amount": 500,
			"seller": "seller2",
			"goods": [{
				"goodsId": 476,
				"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
				"name": "西服套装的",
				"specName": "16G + 512G",
				"price": 500,
				"num":1
			}]
		}]
	}
}
```

## 5.2 pay

**接口说明**

确认付款

**请求方式**

post

**URL**

```
/api/mall/order/pay
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明   |
| ------ | -------- | -------- | ------ |
| id     | integer  | 必须     | 订单id |

```json
{"orderId":0}
```

**返回参数**

| 参数名  | 参数类型 | 是否必须 | 说明     |
| ------- | -------- | -------- | -------- |
| code    | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{"code":0}
```


## 5.3 editOrderInfo

**接口说明**

编辑订单的收货信息

**请求方式**

POST

**URL**

```
/api/mall/order/editOrderInfo
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| orderId   | int     | 必须     | 订单id |
| newName   | str     | 必须     | 新的收货人姓名 |
| newPhone   | str     | 必须     | 新的收货手机号 |
| newAddress   | str     | 必须     | 新的收货地址 |

```json
{
    "orderId":10,
	"newName":"小五",
	"newPhone":12345678965,
	"newAddress":"上海"
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

## 5.4 cancelOrder

**接口说明**

取消订单，包括了退款功能

**请求方式**

POST

**URL**

```
/api/mall/order/cancelOrder
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| orderId   | int     | 必须     | 要取消的订单号 |

```json
{
    "orderId":10
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

## 5.5 confirmReceive

**接口说明**

确认收货

**请求方式**

POST

**URL**

```
/api/mall/order/confirmReceive
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明   |
| ------ | -------- | -------- | ------ |
| id     | integer  | 必须     | 订单id |

```json
{
    "orderId":10
}
```

**返回参数**

| 参数名  | 参数类型 | 是否必须 | 说明     |
| ------- | -------- | -------- | -------- |
| code    | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{"code":0}
```

## 5.6 complainOrder

**接口说明**

投诉订单

**请求方式**

POST

**URL**

```
/api/mall/order/complainOrder
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明   |
| ------ | -------- | -------- | ------ |
| id     | integer  | 必须     | 订单id |

```json
{
    "orderId":10,
	"username":"user1",
	"reason":"bad product"
}
```

**返回参数**

| 参数名  | 参数类型 | 是否必须 | 说明     |
| ------- | -------- | -------- | -------- |
| code    | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{"code":0}
```

## 6.1 buyNow

**接口说明**

立刻购买

**请求方式**

POST

**URL**

```
/api/mall/order/buyNow
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username| str    | 必须     | 用户名 |
| goodsId | integer  | 必须     | 商品id |
| num | integer  | 必须     | 商品数量 |
| specIndex | integer  | 可选     | 商品规格index |

```json
{
    "username":"user1",
    "goodsId":1,
	"num":1,
	"specIndex":0
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