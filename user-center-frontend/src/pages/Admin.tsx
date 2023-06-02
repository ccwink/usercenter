import React from 'react';
import { PageHeaderWrapper } from '@ant-design/pro-layout';


const Admin: React.FC = (props) => {
  const {children} = props;
  return (
    // 这个页面只有 admin 权限才能查看
    <PageHeaderWrapper>
      {children}
    </PageHeaderWrapper>
  );
};
export default Admin;
