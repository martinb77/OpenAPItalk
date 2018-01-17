/**
 * Ze API
 * description
 *
 * OpenAPI spec version: 1.0.0
 * Contact: martin.binder@qaware.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ZeApi) {
      root.ZeApi = {};
    }
    root.ZeApi.HelloDTO = factory(root.ZeApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The HelloDTO model module.
   * @module model/HelloDTO
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>HelloDTO</code>.
   * @alias module:model/HelloDTO
   * @class
   * @param greeting {String} 
   */
  var exports = function(greeting) {
    var _this = this;

    _this['greeting'] = greeting;
  };

  /**
   * Constructs a <code>HelloDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/HelloDTO} obj Optional instance to populate.
   * @return {module:model/HelloDTO} The populated <code>HelloDTO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('greeting')) {
        obj['greeting'] = ApiClient.convertToType(data['greeting'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} greeting
   */
  exports.prototype['greeting'] = undefined;



  return exports;
}));

