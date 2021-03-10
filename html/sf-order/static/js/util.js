window.Utils = {
  isScrolledIntoView: function (e, t) {
    var n =
        window.innerHeight ||
        document.documentElement.clientHeight ||
        document.body.clientHeight,
      r = e.getBoundingClientRect().top;
    return r && r < n + (t || 0);
  },
  hasClass: function (e, t) {
    return !!e && e.className.indexOf(t) > -1;
  },
  addClass: function (e, t) {
    var n = this,
      r = this.getNodeList(e);
    this.forEach(r, function (e) {
      n.hasClass(e, t) || (e.className += " " + t);
    });
  },
  removeClass: function (e, t) {
    var n = this,
      r = this.getNodeList(e);
    this.forEach(r, function (e) {
      n.hasClass(e, t) && (e.className = e.className.split(t).join(""));
    });
  },
  getNodeList: function (e) {
    if (e) return e instanceof NodeList || e instanceof Array ? e : [e];
  },
  forEach: function (e, t) {
    [].slice.call(e || [], 0).forEach(t);
  },
};
