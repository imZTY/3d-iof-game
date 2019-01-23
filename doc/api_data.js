define({ "api": [
  {
    "type": "get",
    "url": "/notice/list/all",
    "title": "按页获取所有公告通知",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号(从0开始)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:0\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 5,\n    \"title\": \"公告2标题\",\n    \"content\": \"公告内容2公告内容2公告内容2公告内容2\",\n    \"kind\": 1,\n    \"createTime\": \"2019-01-23T10:47:48.000+0000\"\n    },\n    {\n    \"id\": 6,\n    \"title\": \"活动1标题\",\n    \"content\": \"活动内容1活动内容1活动内容1\",\n    \"kind\": 2,\n    \"createTime\": \"2019-01-23T10:48:30.000+0000\"\n    },\n    {\n    \"id\": 7,\n    \"title\": \"通知1标题\",\n    \"content\": \"通知内容1通知内容1通知内容1\",\n    \"kind\": 0,\n    \"createTime\": \"2019-01-23T10:48:53.000+0000\"\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/NoticeController.java",
    "groupTitle": "公告",
    "name": "GetNoticeListAll"
  },
  {
    "type": "get",
    "url": "/notice/list/kind",
    "title": "按页按类型获取公告通知",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号(从0开始)</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "kind",
            "description": "<p>公告类型(0=通知, 1=公告, 2=活动)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:0,\n    kind:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 5,\n    \"title\": \"公告2标题\",\n    \"content\": \"公告内容2公告内容2公告内容2公告内容2\",\n    \"kind\": 1,\n    \"createTime\": \"2019-01-23T10:47:48.000+0000\"\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/NoticeController.java",
    "groupTitle": "公告",
    "name": "GetNoticeListKind"
  },
  {
    "type": "post",
    "url": "/notice/add",
    "title": "添加公告",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>公告标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>公告内容</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "kind",
            "description": "<p>公告类型(0=通知, 1=公告, 2=活动)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    title:公告2标题\n    content:公告内容2公告内容2公告内容2公告内容2\n    kind:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 5,\n    \"title\": \"公告2标题\",\n    \"content\": \"公告内容2公告内容2公告内容2公告内容2\",\n    \"kind\": 1,\n    \"createTime\": \"2019-01-23T10:47:48.176+0000\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/NoticeController.java",
    "groupTitle": "公告",
    "name": "PostNoticeAdd"
  },
  {
    "type": "post",
    "url": "/notice/delete",
    "title": "删除公告",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>公告id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:4\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/NoticeController.java",
    "groupTitle": "公告",
    "name": "PostNoticeDelete"
  },
  {
    "type": "post",
    "url": "/player/login",
    "title": "玩家登录",
    "group": "Player",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>登录密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phone",
            "description": "<p>手机号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    password:abc123\n    phone:18320222222\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 1,\n    \"name\": \"Tianyi Zeng\",\n    \"password\": \"abc123\",\n    \"phone\": \"18320222222\",\n    \"exp\": 0,\n    \"level\": 0,\n    \"headPic\": 2\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\n    \"resultCode\": 444,\n    \"resultMsg\": \"密码错误\",\n    \"data\": null\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/PlayerController.java",
    "groupTitle": "玩家",
    "name": "PostPlayerLogin"
  },
  {
    "type": "post",
    "url": "/player/register",
    "title": "玩家注册",
    "group": "Player",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "headPic",
            "description": "<p>头像图片序号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>昵称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>登录密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phone",
            "description": "<p>手机号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    headPic:2\n    name:Tianyi Zeng\n    password:abc123\n    phone:18320222222\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 1,\n    \"name\": \"Tianyi Zeng\",\n    \"password\": \"abc123\",\n    \"phone\": \"18320222222\",\n    \"exp\": 0,\n    \"level\": 0,\n    \"headPic\": 2\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/PlayerController.java",
    "groupTitle": "玩家",
    "name": "PostPlayerRegister"
  },
  {
    "type": "get",
    "url": "/record/single/player",
    "title": "按页按玩家获取游戏记录",
    "group": "RecordSingle",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号(从0开始)</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>玩家id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:0,\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 2,\n    \"playerId\": 1,\n    \"score\": 100,\n    \"detailJson\": \"[{[\\\"15\\\",\\\"2:20:22\\\"]},{[\\\"46\\\",\\\"3:02:43\\\"]}]\",\n    \"status\": 1,\n    \"wholePoint\": 5,\n    \"finishPoint\": 2,\n    \"valid\": true,\n    \"model\": 0\n    },\n    {\n    \"id\": 3,\n    \"playerId\": 1,\n    \"score\": 10,\n    \"detailJson\": \"[{[\\\"13\\\",\\\"2:20:22\\\"]},{[\\\"42\\\",\\\"3:02:43\\\"]}]\",\n    \"status\": -1,\n    \"wholePoint\": 7,\n    \"finishPoint\": 2,\n    \"valid\": false,\n    \"model\": 0\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/RecordSingleController.java",
    "groupTitle": "单记录",
    "name": "GetRecordSinglePlayer"
  },
  {
    "type": "post",
    "url": "/record/single/add",
    "title": "添加游戏记录",
    "group": "RecordSingle",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "playerId",
            "description": "<p>玩家id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "score",
            "description": "<p>本局游戏分数</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "detailJson",
            "description": "<p>分数详情json字符串(打点顺序与时间)</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "status",
            "description": "<p>结果状态（-1=中途退出，1=圆满结束）</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "wholePoint",
            "description": "<p>总点数</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "finishPoint",
            "description": "<p>完成点数</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "valid",
            "description": "<p>是否有效</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "model",
            "description": "<p>游戏模式（1=经典单人模式）</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    playerId:1\n    score:10\n    detailJson:[{[\"13\",\"2:20:22\"]},{[\"42\",\"3:02:43\"]}]\n    status:-1\n    wholePoint:7\n    finishPoint:2\n    valid:false\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 3,\n    \"playerId\": 1,\n    \"score\": 10,\n    \"detailJson\": \"[{[\\\"13\\\",\\\"2:20:22\\\"]},{[\\\"42\\\",\\\"3:02:43\\\"]}]\",\n    \"status\": -1,\n    \"wholePoint\": 7,\n    \"finishPoint\": 2,\n    \"valid\": false,\n    \"model\": 0\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/iof/gmdata/common/controller/RecordSingleController.java",
    "groupTitle": "单记录",
    "name": "PostRecordSingleAdd"
  }
] });
